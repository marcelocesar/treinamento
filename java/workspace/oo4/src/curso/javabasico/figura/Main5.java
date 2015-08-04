package curso.javabasico.figura;

public class Main5 {

	public static void main(String[] args) {
		String s1 = "Ola";
		String s2 = "Ola";
		String s3 = new String("Ola");
		
		if (s1 == s2) {
			System.out.println("Referencias iguais");
		}
		if (s1.equals(s2)) {
			System.out.println("Conteudo igual");
		}
		
		if (s1 == s3) {
			System.out.println("Referencias iguais (s3)");
		}
		if (s1.equals(s3)) {
			System.out.println("Conteudo igual (s3)");
		}
	}

}
