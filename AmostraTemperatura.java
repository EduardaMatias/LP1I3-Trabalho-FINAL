package exfinal;

/**
 * @author Eduarda Vitória e Stefany Tam
 * - O construtor AmostraTemperatura deve nos permitir a digitação dos valores de data, hora e valor da temperatura;
 * - Os outros dois construtores devem receber os valores de data, hora e valor sob a forma de parâmetros;
 * - Os métodos setData(), setHora() e setValor() deve nos permitir alterar os valores das respectivas propriedades através da digitação de novos valores, setValor deve acrescer um a sequencia, toda vez que for chamado;
 * - Os demais métodos *set* devem alterar os valores das propriedades a partir dos parâmetros recebidos;
 * - O método getData() deve nos devolver a data no formato: dd/mm/aa;
 * - O método getHora() deve nos devolver a hora no formato: hh:mm:ss.
 */

import java.util.Scanner;

public class AmostraTemperatura {

    Scanner scan = new Scanner(System.in);
    Data data;
    Hora hora;
    int numseq;
    float valor;

    public AmostraTemperatura() {
        data = new Data();
        hora = new Hora();
        System.out.print("Valor da temperatura: ");
        valor = scan.nextFloat();
    }

    public AmostraTemperatura(int a, int b, int c, int d, int e, int f, float v) {
        this.valor = v;
        data = new Data(a, b, c);
        hora = new Hora(d, e, f);
    }

    public AmostraTemperatura(Data d, Hora h, float v) {
        this.data = d;
        this.hora = h;
        this.valor = v;
    }

    public void setData(int a, int b, int c) {
        data.setDia(a);
        data.setMes(b);
        data.setAno(c);
    }

    public void setData() {
        data.setDia();
        data.setMes();
        data.setAno();
    }

    public void setHora(int a, int b, int c) {
        hora.setHor(a);
        hora.setMin(b);
        hora.setHor(c);
    }

    public void setHora() {
        hora.setHor();
        hora.setMin();
        hora.setHor();
    }

    public void setValor(float v) {
        this.valor = v;
        numseq += 1;
    }

    public void setValor() {
        System.out.print("Valor da temperatura: ");
        valor = scan.nextFloat();
        numseq += 1;
    }

    public int getNumSeq() {
        return numseq;
    }

    public String getData() {
        return data.mostra1();
    }

    public String getHora() {
        return hora.getHora1();
    }

    public float getValor() {
        return valor;
    }
}

