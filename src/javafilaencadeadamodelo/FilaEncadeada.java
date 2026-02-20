
package javafilaencadeadamodelo;

public class FilaEncadeada<T> {
    private No<T> inicio; // início da fila
    private No<T> fim; // fim da fila
    
    public FilaEncadeada() {
        this.inicio = null;
        this.fim = null;
    }
    
    public boolean isEmpty() {
        return inicio == null; // se o início for nulo, a fila está vazia
    }
    
    public void enqueue(T objeto) {
        No<T> novoNo = new No<>();
        novoNo.setDado(objeto);
        novoNo.setProx(null); // como o novo nó é inserido no fim, seu próximo é nulo
        
        if (isEmpty()) {
            inicio = novoNo; // se a fila estiver vazia, o novo nó será tanto o início quanto o fim
        } else {
            fim.setProx(novoNo); // caso contrário, o próximo do nó no fim da fila será o novo nó
        }
        fim = novoNo; // o novo nó agora é o fim da fila
    }
    
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia!"); // lançar exceção se a fila estiver vazia
        }
        
        T dadoRemovido = inicio.getDado(); // obter o dado no início da fila
        inicio = inicio.getProx(); // avançar o início para o próximo nó
        
        if (inicio == null) {
            fim = null; // se a fila estiver vazia, também ajustamos o fim para nulo
        }
        
        return dadoRemovido;
    }
    
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia!"); // lançar exceção se a fila estiver vazia
        }
        
        return inicio.getDado(); // retornar o dado no início da fila
    }
    
    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        No<T> noAtual = inicio; // começamos a percorrer a fila a partir do início
        while (noAtual != null) {
            retorno.append(noAtual.getDado()).append("\n"); // adicionar dados à representação da fila
            noAtual = noAtual.getProx(); // avançar para o próximo nó
        }
        retorno.append("-----------");
        return retorno.toString();
    }
    
}
