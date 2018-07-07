import java.io.RandomAccessFile;
import java.io.IOException;

public class CriaIndice{

	public static void main(String args[]) throws IOException{

		RandomAccessFile arq = new RandomAccessFile("bolsa.csv", "r");

		/*RandomAccessFile indice1 = new RandomAccessFile("indice.dat", "rw");
		String linhaVazia = "" + "\t" + 0 + "\t" + 0 + "\n";
		indice1.writeBytes("\t" + linhaVazia);
		for(long i = 0; i < 17035858; i++){
			indice1.writeBytes(linhaVazia);
		}
		indice1.close();*/

		RandomAccessFile indice = new RandomAccessFile("indice.dat", "rw");

		escreveIndice(arq, indice);

		arq.close();
		indice.close();


	}

	public static void escreveIndice(RandomAccessFile arq, RandomAccessFile indice) throws IOException{
		long pos1, pos2;
		long numAux = 0;
		String linha;
		long p = 0;

		Bolsa b = new Bolsa();
		linha = arq.readLine(); //pula a primeira linha, que não tem os dados
		while(numAux < 17035859){
			//17035859
			
			linha = arq.readLine();
			if(linha.equals("")){
				break;
			}
			b.leBolsa(linha);
			p = h(b.getNis());
			indice.seek(p*(linha.length()));
			pos2 = p;
			//indice.length();
			pos1 = numAux;
			indice.writeBytes(b.getLinha() + "\t" + pos1 + "\t" + pos2 + "\n");
			numAux += 1;
		}
	}


	public static long h(String chave){
		return (Long.parseLong(chave))%17035859;
	}

}