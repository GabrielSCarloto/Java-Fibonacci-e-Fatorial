package exercicios;

public class fibonacci {

	public static void main(String[] args) {
		
		int primeiro = 0;
		int segundo = 1;
		int terceiro = 0;
		
		while(terceiro < 100) {
			System.out.println(terceiro);
			terceiro = primeiro + segundo;
			primeiro = segundo;
			segundo = terceiro;
		}
	}

}
