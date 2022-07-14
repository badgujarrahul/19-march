package generalization;

public class GeneralizationCall {

	public static void main(String[] args) {
		Pune p=new Pune();
		System.out.println("++++++++++pune+++++++++++");
		p.English();
		p.Hindi();
		p.Math();
		p.marathi();
		System.out.println("++++++++++surat+++++++++++");
		surat s= new surat();
		s.English();
		s.Hindi();
		s.Math();
		s.gujrati();
	}

}
