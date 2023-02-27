package taller3.televisores;

public class TV{
private Marca marca;
int canal=1;
private int precio=500;
private boolean estado;
private int volumen=1;
public static int numTV;
Control control;

public TV(Marca marca, boolean estado){
	this.marca=marca;
	this.estado=estado;
	TV.numTV++;
}

public static void setNumTV(int mnumTV) {
	TV.numTV=mnumTV;
}
public static int getNumTV() {
	return numTV;
}
public void setMarca(Marca marca) {
	this.marca=marca;
}
public Marca getMarca() {
	return this.marca;
}
public void setControl(Control control) {
	this.control=control;
}
public Control getControl() {
	return this.control;
}
public void setPrecio(int precio) {
	this.precio=precio;
}
public int getPrecio() {
	return this.precio;
}
public void setVolumen(int volumen) {
	if (volumen >0 && volumen < 7){
	this.volumen=volumen;
}
}
public int getVolumen() {
	return this.volumen;
}
public void setCanal(int canal) {
	if (canal >1 && canal < 120){
	this.canal=canal;
}
}
public int getCanal() {
	return this.canal;
}
public void turnOn() {
	estado=true;
}
public void turnOff() {
	estado=false;
}
public boolean getEstado() {
	return this.estado;
}
public void canalUp() {
    if (estado && canal < 120) {
        canal++;
    }
}
public void canalDown() {
    if (estado && canal > 1) {
        canal--;
    }
}
public void volumenUp() {
    if (estado && canal > 0) {
        canal--;
    }
}
public void volumenDown() {
    if (estado && canal < 7) {
        canal++;
    }
}
}
