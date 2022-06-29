package exfinal;

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
