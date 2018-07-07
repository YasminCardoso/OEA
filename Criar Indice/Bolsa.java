import java.io.IOException;
import java.io.RandomAccessFile;

public class Bolsa{

		private String uf;
		private String siafi;
		private String municipio;
		private String municipioCod;
		private String funcaoCod;
		private String subfuncaoCod;
		private String programaCod;
		private String nis;
		private String nome;
		private String fonte;
		private String parcelaMes;
		private String competencia;

	public void leBolsa(String linha) throws IOException{

			//String linha;
			String colunas[];
			long posicao;

			//arq.readLine();

			//swhile(arq.getFilePointer() < arq.length()){

				//linha = arq.readLine();
				colunas = linha.split("\t");

				uf = colunas[0];
				siafi = colunas[1];
				municipio = colunas[2];
				municipioCod = colunas[3];
				funcaoCod = colunas[4];
				subfuncaoCod = colunas[5];
				programaCod = colunas[6];
				nis = colunas[7];
				nome = colunas[8];
				fonte = colunas[9];
				parcelaMes = colunas[10];
				competencia = colunas[11];

			//}

	}

	/*public void escreveBolsa(RandomAccessFile arq) throws IOException{

		arq.writeBytes(this.uf);
		arq.writeByte('\t');
		arq.writeBytes(this.siafi);
		arq.writeByte('\t');
		arq.writeBytes(this.municipio);
		arq.writeByte('\t');
		arq.writeBytes(this.municipioCod);
		arq.writeByte('\t');
		arq.writeBytes(this.funcaoCod);
		arq.writeByte('\t');
		arq.writeBytes(this.subfuncaoCod);
		arq.writeByte('\t');
		arq.writeBytes(this.programaCod);
		arq.writeByte('\t');
		arq.writeBytes(this.nis);
		arq.writeByte('\t');
		arq.writeBytes(this.nome);
		arq.writeByte('\t');
		arq.writeBytes(this.fonte);
		arq.writeByte('\t');
		arq.writeBytes(this.parcelaMes);
		arq.writeByte('\t');
		arq.writeBytes(this.competencia);
		arq.writeByte('\n');

	}*/

	public String getNis(){
		return nis;
	}

	public void setNis(String nis){
		this.nis = nis;
	}

	public String getLinha(){
		return nis + "\t" + uf + "\t" +  siafi + "\t" + municipio + "\t" + municipioCod + "\t" + funcaoCod + 
		"\t" + subfuncaoCod + "\t" + programaCod + "\t" + nome + "\t" + fonte +
		"\t" + parcelaMes + "\t" + competencia;
	}

}