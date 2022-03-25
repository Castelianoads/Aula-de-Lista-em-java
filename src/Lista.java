import java.lang.reflect.Array;

public class Lista<T> {    
    private T[] elementos; // Elementos da lista
    private int tamanho; // Tamanho da lista
    // Construtor para o usuario passa a capacidade do vetor
    public Lista (int capacidade){
        elementos = (T[])new Object[capacidade];
        tamanho = 0;
    }

	public Lista(int capacidade, Class<T> tipoCLasse){
		this.elementos = (T[]) Array.newInstance(tipoCLasse, capacidade);
		this.tamanho = 0;
	}
    
    public void adicionar(T elemento) throws Exception {
		this.aumentarTamanho();
    	if(tamanho <elementos.length) {
    		elementos[tamanho] = elemento;
    		tamanho++;
    	} else {
    		throw new Exception("Vetor est� cheio");
    	}
    }
    
	// Adiciona o elemento no final da lista
	public boolean adiciona(T contato){
		this.aumentarTamanho();
		if(tamanho < elementos.length){
			elementos[tamanho] =  contato;
			tamanho++;
			return true;
		}
		return false;
	}

	public int tamanho(){
		return tamanho;
	}

	// Ele busca o elemento na posição passando a posiçao do elemento
	public Object busca(int posicao) throws IllegalAccessException{
		if(!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalAccessException("Posição inválida.");
		}
		return elementos[posicao];
	}

	// Ele busca o elemento na posição passando o elemento
	public int busca(T elemento){
		for (int i = 0; i < tamanho; i++) {
			if (elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

	// Adiciona o elemento na posição desejada
	public boolean adiciona(int posicao, T elemento) throws IllegalAccessException{
		if(!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalAccessException("Posição inválida.");
		}
		this.aumentarTamanho();
		// Desloca o elemento para posição vazia
		for (int i = tamanho - 1; i >= posicao; i--) {
			elementos[i+1] = elementos[i];
		}

		elementos[posicao] = elemento;
		tamanho++;

		return true;
	}

	// Remove o elemento na posicao desejada
	public void remover(int posicao) throws IllegalAccessException{
		if(!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalAccessException("Posição inválida.");
		}
		// Desloca os elementos para a posição vazia
		for (int i = posicao; i < tamanho - 1; i++) {
			elementos[i] = elementos[i+1];
		}
		tamanho--;
	}

	private void aumentarTamanho(){
		if (tamanho == elementos.length) {
			T[] elementosNovos = (T[])new Object[elementos.length * 2];
			for (int i = 0; i < elementos.length; i++) {
				elementosNovos[i] = elementos[i];
			}
			elementos = elementosNovos;
		}



	}

	@Override
	public String toString() {
		
		StringBuffer s = new StringBuffer();
		s.append("[");
		
		for(int i = 0; i < tamanho-1; i++) {
			s.append(elementos[i]);
			s.append(", ");
		}
		
		if(tamanho > 0) {
			s.append(elementos[tamanho-1]);
		}
		
		s.append("]");		
		return s.toString();
	}
}
