public class Main {
    public static void main(String[] args) {
    	
        Lista<String> lista = new Lista(3);
        Contato c1 = new Contato("c1", "9211-2115", "carlos@gmail.com");
        Contato c2 = new Contato("c2", "2563-7821", "andre@gmail.com");
        Contato c3 = new Contato("c3", "1347-8345", "anderson@gmail.com");

        try {
            //lista.adiciona(c1);
            //lista.adiciona(c2);
            //lista.adiciona(c3);
            System.out.println(lista);


        	/*vetor.adiciona(1);
            vetor.adiciona(2);
            vetor.adiciona(3);
            vetor.adiciona(0, 4);
            System.out.println("Vetor: " + vetor);
            vetor.remover(0);
            System.out.println("Vetor: " + vetor);*/
            //System.out.println("O elemento e: " + vetor.busca(2));
            //System.out.println("A posição e: " +vetor.busca("Elemento 4"));
            ////System.out.println("A posição e: " +vetor.busca("Elemento 4"));
        } catch(Exception e){
        	e.printStackTrace();
        }
        
        
        
        
        
    }
	
}
