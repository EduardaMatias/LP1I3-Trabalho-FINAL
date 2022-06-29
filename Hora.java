package exfinal;

import java.util.Scanner;

/**
 *
 * @author stefa
 */
public class Hora {
	Scanner scan = new Scanner(System.in);
	private int hora = 0;
	private int min = 0;
	private int seg = 0;

	public Hora() {

		do {
			System.out.print("Horas: ");
			hora = scan.nextInt();
		} while (hora > 24 || hora < 1);
		do {
			System.out.print("Minutos: ");
			min = scan.nextInt();
		} while (min > 60 || min < 0);
		do {
			System.out.print("Segundos: ");
			seg = scan.nextInt();
		} while (seg > 60 || seg < 0);
	}

	public Hora(int h, int m, int s) {
		this.hora = h;
		this.min = m;
		this.seg = s;
	}

	public void setHor(int h) {
		this.hora = h;
	}

	public void setMin(int m) {
		this.min = m;
	}

	public void setSeg(int s) {
		this.seg = s;
	}

	public void setHor() {
		do {
			System.out.print("Hora: ");
			hora = scan.nextInt();
		} while (hora > 24 || hora < 1);
	}

	public void setMin() {
		do {
			System.out.print("Minutos: ");
			min = scan.nextInt();
		} while (min > 60 || min < 0);
	}

	public void setSeg() {
		do {
			System.out.print("Segundos: ");
			seg = scan.nextInt();
		} while (seg > 60 || seg < 0);
	}

	public int getHor() {
		return hora;
	}

	public int getMin() {
		return min;
	}

	public int getSeg() {
		return seg;
	}

	public String getHora1() {
		String horaFormatada, minFormatado, segFormatado, horarioFormatado;

		if (this.hora < 10) {
			horaFormatada = "0" + this.hora;
		} else {
			horaFormatada = "" + this.hora;
		}
		if (this.min < 10) {
			minFormatado = "0" + this.min;
		} else {
			minFormatado = "" + this.min;
		}
		if (this.seg < 10) {
			segFormatado = "0" + this.seg;
		} else {
			segFormatado = "" + this.seg;
		}

		horarioFormatado = horaFormatada + ":" + minFormatado + ":" + segFormatado;
		return horarioFormatado;
	}

	public String getHora2() {
		String hr, min, seg, turno, horarioFormatado;
		int hrAux;

		if (this.hora > 12) {
			hrAux = this.hora - 12;
		} else {
			hrAux = this.hora;
		}
		if (hrAux < 10) {
			hr = "0" + hrAux;
		} else {
			hr = "" + hrAux;
		}

		if (this.min < 10) {
			min = "0" + this.min;
		} else {
			min = "" + this.min;
		}
		if (this.seg < 10) {
			seg = "0" + this.seg;
		} else {
			seg = "" + this.seg;
		}
		if (this.hora < 12) {
			turno = "AM";
		} else {
			turno = "PM";
		}

		horarioFormatado = hr + ":" + min + ":" + seg + "(" + turno + ")";
		return horarioFormatado;
	}

	public int getSegundos() {
		int horaSeg = this.hora * 3600;
		int minSeg = this.min * 60;
		int horarioSeg = this.seg + horaSeg + minSeg;
		System.out.println("---------------- \n" + horarioSeg + " segundos");
		return horarioSeg;
	}
}


