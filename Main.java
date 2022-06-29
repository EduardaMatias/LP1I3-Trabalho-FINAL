package exfinal;

/**
 * @author Eduarda Vitória e Stefany Tam
 * Para testar a classe criada siga os passos abaixo respeitando a ordem em que eles serão solicitados:
 
 * Usando a classe AmostraTemperatura instancie o objeto t1 inicializado-o com o construtor AmostraTemperatura(int a, int b, int c, int d, int e, int f, float v);
 * Exiba todas as propriedades de t1;
 * Agora instancie o objeto t2 usando o construtor AmostraTemperatura();
 * Exiba todas as propriedades de t2;
 * Usando os métodos setData(), setHora() e setValor, altere as propriedades de T1;
 * Exiba todas as propriedades de t1 novamente.
 */

public class Main {

	public static void main(String[] args) {
		AmostraTemperatura t1 = new AmostraTemperatura(5, 7, 2022, 20, 25, 2, 22.5f);


        System.out.println("Propriedades de t1\n");
        System.out.println("Data: " + t1.getData());
        System.out.println("Hora: " + t1.getHora());
        System.out.println("Valor da temperatura: " + t1.getValor());
        
        System.out.println("-----------------------------");
        
        System.out.println("\nInicializando t2 \n");
        
        AmostraTemperatura t2 = new AmostraTemperatura();
        
        System.out.println("\nPropriedades de t2\n");
        System.out.println("Data: " + t2.getData());
        System.out.println("Hora: " + t2.getHora());
        System.out.println("Valor da temperatura: " + t2.getValor());
        
        System.out.println("-----------------------------");

        System.out.println("\nAlterando propriedades de t1\n");

        t1.setData();
        t1.setHora();
        t1.setValor();

        System.out.println("\nPropriedades modificadas de t1\n");
        System.out.println("Data: " + t1.getData());
        System.out.println("Hora: " + t1.getHora());
        System.out.println("Valor da temperatura: " + t1.getValor());
	}

}
