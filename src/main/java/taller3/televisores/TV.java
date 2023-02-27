package taller3.televisores;

public class TV{
private Marca marca;
int canal=1;
private int precio=500;
private boolean estado;
private int volumen=1;
private int numTV=0;

Control control;
public TV(Marca marca, boolean estado){
	this.marca=marca;
	this.estado=estado;
	numTV=numTV++;
}

public void setNumTV(int numTV) {
	this.numTV=numTV;
}
public int getNumTV() {
	return numTV;
}
public void setMarca(Marca marca) {
	this.marca=marca;
}
public Marca getMarca() {
	return marca;
}
public void setControl(Control control) {
	this.control=control;
}
public Control getControl() {
	return control;
}
public void setPrecio(int precio) {
	this.precio=precio;
}
public int getPrecio() {
	return precio;
}
public void setVolumen(int volumen) {
	this.volumen=volumen;
}
public int getVolumen() {
	return volumen;
}
public void setCanal(int canal) {
	this.canal=canal;
}
public int getCanal() {
	return canal;
}
public void turnOn() {
	estado=true;
}
public void turnOff() {
	estado=false;
}
public boolean getEstado() {
	return estado;
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
