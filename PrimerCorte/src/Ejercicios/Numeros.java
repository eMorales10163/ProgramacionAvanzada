package Ejercicios;
import java.io.*;
import java.util.*;

public class Numeros {
	String input, output;
	char operacion;
	String[] num;
	String dataFiles;

	public static void main(String args[]) {
		String input = "Numeros.txt";
		String output = "Resultado.txt";
		Numeros fileOp = new Numeros(input, output);
	}

	public Numeros(String input, String output) {
		this.input = input;
		this.output = output;
		try {
			File f1 = new File(input);
			FileInputStream fstream = new FileInputStream(f1);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			FileWriter fw = new FileWriter(output, true);
			BufferedWriter bw = new BufferedWriter(fw);
			do {
				operacion = '\0';
				dataFiles = br.readLine();
				if (dataFiles != null) {
					for (int i = 0; i < dataFiles.length(); i++) {
						if (dataFiles.charAt(i) == '+' || dataFiles.charAt(i) == '-') {
							operacion = dataFiles.charAt(i);
						}
					}
					String c = operacion + "";
					if (operacion != '\0') { 
						num = dataFiles.split("\\" + c);
						if (operacion == '+') {
							//hexadecimal a decimal
							int numero1 = Integer.parseInt(num[0],16);
							int numero2 = Integer.parseInt(num[1],16);
							int resultado = numero1 + numero2;
							String binario1 = obtenerBinario(numero1);
							String binario2 = obtenerBinario(numero2);
							//decimal a binario
							bw.write(binario1+ " + " + binario2 + " = " + resultado + "");
							bw.newLine();
						} else if (operacion == '-') {
							//hexadecimal a decimal
							int numero1 = Integer.parseInt(num[0],16);
							int numero2 = Integer.parseInt(num[1],16);
							//si la resta es negativa
							if(numero2>numero1) {
								bw.write("Esta operacion no se puede realizar");
								bw.newLine();
							}
							else {
								int resultado = numero1 - numero2;
								String binario1 = obtenerBinario(numero1);
								String binario2 = obtenerBinario(numero2);
								//decimal a binario
								bw.write(binario1+ " + " + binario2 + " = " + resultado + "");
								bw.newLine();
							}
						} 
					} else {
						bw.write(dataFiles);
						bw.newLine();
					}
				}
			} while (dataFiles != null);
			br.close();
			bw.close();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}

	public static String obtenerBinario(int numero){
		ArrayList<String> binario = new ArrayList<String>();
		int resto;
		String binarioString = "";
		Formatter obj = new Formatter();
		do{
			resto = numero%2;
			numero = numero/2;
			binario.add(0, Integer.toString(resto));
		}while(numero > 2); 
		binario.add(0, Integer.toString(numero)); 
		for(int i = 0; i < binario.size(); i++){
			binarioString += binario.get(i);
		}
		if(binarioString.length()<8) {
			binarioString = String.valueOf(obj.format("%08d", Integer.parseInt(binarioString)));
		}
		return binarioString;
	}
}
