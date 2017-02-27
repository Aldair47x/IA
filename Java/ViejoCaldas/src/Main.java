import grph.Grph;
import cnrs.grph.set.IntSet;
import grph.algo.AdjacencyMatrix;
import grph.properties.IntProperty;

public class Main {
    
    public static void main(String[] args) {
        Grafo viejo_caldas = new Grafo();
        viejo_caldas.addNodos(53);
        viejo_caldas.setNombreNodo(1, "Manizales");
        viejo_caldas.setNombreNodo(2, "Neira");
        viejo_caldas.setNombreNodo(3, "Villamaria");
        viejo_caldas.setNombreNodo(4, "Palestina");
        viejo_caldas.setNombreNodo(5, "Chinchina");
        viejo_caldas.setNombreNodo(6, "Belalcazar");
        viejo_caldas.setNombreNodo(7, "Viterbo");
        viejo_caldas.setNombreNodo(8, "San jose");
        viejo_caldas.setNombreNodo(9, "Risaralda");
        viejo_caldas.setNombreNodo(10, "Anserma");
        viejo_caldas.setNombreNodo(11, "Filadelfia");
        viejo_caldas.setNombreNodo(12, "La mercerd");
        viejo_caldas.setNombreNodo(13, "Supia");
        viejo_caldas.setNombreNodo(14, "Riosucio");
        viejo_caldas.setNombreNodo(15, "Marmato");
        viejo_caldas.setNombreNodo(16, "Aranzazu");
        viejo_caldas.setNombreNodo(17, "Salamina");
        viejo_caldas.setNombreNodo(18, "Pacora");
        viejo_caldas.setNombreNodo(19, "Aguadas");
        viejo_caldas.setNombreNodo(20, "Marulanda");
        viejo_caldas.setNombreNodo(21, "Pensilvania");
        viejo_caldas.setNombreNodo(22, "Manzanares");
        viejo_caldas.setNombreNodo(23, "Marquetalia");
        viejo_caldas.setNombreNodo(24, "Samana");
        viejo_caldas.setNombreNodo(25, "Norcasia");
        viejo_caldas.setNombreNodo(26, "Victoria");
        viejo_caldas.setNombreNodo(27, "Dorada");
        viejo_caldas.setNombreNodo(28, "Genova");
        viejo_caldas.setNombreNodo(29, "Pijao");
        viejo_caldas.setNombreNodo(30, "Buena vista");
        viejo_caldas.setNombreNodo(31, "Cordoba");
        viejo_caldas.setNombreNodo(32, "La tebaida");
        viejo_caldas.setNombreNodo(33, "Calarca");
        viejo_caldas.setNombreNodo(34, "Armenia");
        viejo_caldas.setNombreNodo(35, "Montenegro");
        viejo_caldas.setNombreNodo(36, "Circasia");
        viejo_caldas.setNombreNodo(37, "Salento");
        viejo_caldas.setNombreNodo(38, "Quimbaya");
        viejo_caldas.setNombreNodo(39, "Filandia");
        viejo_caldas.setNombreNodo(40, "Salento");
        
        
        
        
        viejo_caldas.setNombreNodo(41, "Mistrato");
        viejo_caldas.setNombreNodo(42, "Pueblo rico");
        viejo_caldas.setNombreNodo(43, "Guatica");
        viejo_caldas.setNombreNodo(44, "Quinchia");
        viejo_caldas.setNombreNodo(45, "Belen de umbria");
        viejo_caldas.setNombreNodo(46, "Apia");
        viejo_caldas.setNombreNodo(47, "Santuario");
        viejo_caldas.setNombreNodo(48, "La celia");
        viejo_caldas.setNombreNodo(49, "Balboa");
        viejo_caldas.setNombreNodo(50, "La virginia");
        viejo_caldas.setNombreNodo(51, "Pereira");
        viejo_caldas.setNombreNodo(52, "Dosquebradas");
        viejo_caldas.setNombreNodo(53, "Santa rosa de cabal");
        viejo_caldas.setNombreNodo(0, "Marsella");
        
        viejo_caldas.addArista(41, 42, true, 0);
        viejo_caldas.addArista(41, 43, true, 0);
        viejo_caldas.addArista(41, 45, true, 0);
        
        viejo_caldas.addArista(42, 45, true, 0);
        viejo_caldas.addArista(42, 46, true, 0);
        viejo_caldas.addArista(42, 47, true, 0);
        
        viejo_caldas.addArista(43, 44, true, 0);
        viejo_caldas.addArista(43, 45, true, 0);
        
        viejo_caldas.addArista(45, 46, true, 0);
        
        viejo_caldas.addArista(46, 47, true, 0);
        
        viejo_caldas.addArista(47, 48, true, 0);
        viejo_caldas.addArista(47, 49, true, 0);
        viejo_caldas.addArista(47, 50, true, 0);
        
        viejo_caldas.addArista(48, 49, true, 0);
        
        viejo_caldas.addArista(49, 50, true, 0);
        viejo_caldas.addArista(49, 51, true, 0);
        
        viejo_caldas.addArista(50, 51, true, 0);
        viejo_caldas.addArista(50, 0, true, 0);
        
        viejo_caldas.addArista(51, 52, true, 0);
        viejo_caldas.addArista(51, 53, true, 0);
        viejo_caldas.addArista(51, 0, true, 0);
        
        viejo_caldas.addArista(52, 53, true, 0);
        viejo_caldas.addArista(52, 0, true, 0);
        
        viejo_caldas.addArista(53, 0, true, 0);
        
        
        
        
        
        
        
        
        
        viejo_caldas.ver();
    }
    
}
