package javafilaencadeadamodelo;
public class No<T> {
    private T dado;
    private No<T> prox;

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public No<T> getProx() {
        return prox;
    }

    public void setProx(No<T> prox) {
        this.prox = prox;
    }
    @Override
    public String toString(){
        return this.dado.toString();
    }
}
