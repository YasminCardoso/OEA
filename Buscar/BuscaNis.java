import java.io.IOException;
import java.util.Scanner;
import java.io.RandomAccessFile;

public class BuscaNis{
	public static void main(String[] args) throws IOException{

		RandomAccessFile indice = new RandomAccessFile("indice.dat", "r");

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o NIS: ");
		String nis = sc.nextLine();

		buscaNis(nis, indice);

		indice.close();

	}

	public static void buscaNis(String nis, RandomAccessFile indice) throws IOException{
		indice.seek(h(nis));
		String linha = indice.readLine();
		String[] colunasIndice = linha.split("\t");
		String nome = colunasIndice[8];
		String valor = colunasIndice[10];

		System.out.println("NIS: " + nis + 
						   "\nNome: " + nome +
						   "\nValor: " + valor);
	}

	public static long h(String chave){
		return (Long.parseLong(chave))%17035859;
	}

}