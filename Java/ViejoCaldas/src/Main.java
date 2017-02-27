import grph.Grph;
import cnrs.grph.set.IntSet;
import grph.algo.AdjacencyMatrix;
import grph.properties.IntProperty;

public class Main {
    
    public static void main(String[] args) {
        Grafo viejo_caldas = new Grafo();
        viejo_caldas.addNodos(53);
        viejo_caldas.removeNodo(40);
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
        
        
        
        // DPTO CALDAS
        // Manizales
        viejo_caldas.addArista(1, 2, true, 21);
        viejo_caldas.addArista(1, 20, true, 127);
        viejo_caldas.addArista(1, 10, true, 70);
        viejo_caldas.addArista(1, 9, true, 55);
        viejo_caldas.addArista(1, 4, true, 30);
        viejo_caldas.addArista(1, 5, true, 24);
        viejo_caldas.addArista(1, 3, true, 9);   
        //Neira
        viejo_caldas.addArista(2, 20, true, 107);
        viejo_caldas.addArista(2, 16, true, 30);
        viejo_caldas.addArista(2, 11, true, 27);
        viejo_caldas.addArista(2, 10, true, 87);        
        //Villamaria
        viejo_caldas.addArista(3, 5, true, 28);        
        //Palestina
        viejo_caldas.addArista(4, 5, true, 9);
        viejo_caldas.addArista(4, 9, true, 39);        
        //Chinchina
        viejo_caldas.addArista(5, 9, true, 46);        
        //Belalcazar
        viejo_caldas.addArista(6, 9, true, 25);
        viejo_caldas.addArista(6, 8, true, 11);
        viejo_caldas.addArista(6, 7, true, 22);        
        //Viterbo
        viejo_caldas.addArista(7, 8, true, 18);
        viejo_caldas.addArista(7, 10, true, 30);        
        //San Jose
        viejo_caldas.addArista(8, 9, true, 13);        
        //Risaralda
        viejo_caldas.addArista(9, 10, true, 14);        
        //Anserma        
        //Filadelfia
        viejo_caldas.addArista(11, 16, true, 18);
        viejo_caldas.addArista(11, 12, true, 15);
        viejo_caldas.addArista(11, 13, true, 45);
        viejo_caldas.addArista(11, 14, true, 58);        
        //La mercerd
        viejo_caldas.addArista(12, 16, true, 33);
        viejo_caldas.addArista(12, 17, true, 27);
        viejo_caldas.addArista(12, 18, true, 60);
        viejo_caldas.addArista(12, 15, true, 38);
        viejo_caldas.addArista(12, 13, true, 30);        
        //Supia
        viejo_caldas.addArista(13, 14, true, 14);
        viejo_caldas.addArista(13, 15, true, 18);        
        //Riosucio        
        //Marmato
        viejo_caldas.addArista(15, 18, true, 70);        
        //Aranzazu
        viejo_caldas.addArista(16, 17, true, 22);
        viejo_caldas.addArista(16, 20, true, 76);        
        //Salamina
        viejo_caldas.addArista(17, 18, true, 33);
        viejo_caldas.addArista(17, 19, true, 48);
        viejo_caldas.addArista(17, 21, true, 124);
        viejo_caldas.addArista(17, 20, true, 55);        
        //Pacora
        viejo_caldas.addArista(18, 19, true, 15);        
        //Aguadas
        viejo_caldas.addArista(19, 21, true, 146);        
        //Marulanda
        viejo_caldas.addArista(20, 21, true, 70);
        viejo_caldas.addArista(20, 22, true, 40);        
        //Pensilvania
        viejo_caldas.addArista(21, 22, true, 30);
        viejo_caldas.addArista(21, 23, true, 50);
        viejo_caldas.addArista(21, 24, true, 95);        
        //Manzanares
        viejo_caldas.addArista(22, 23, true, 25);        
        //Marquetalia
        viejo_caldas.addArista(23, 24, true, 45);
        viejo_caldas.addArista(23, 26, true, 28);        
        //Samaná
        viejo_caldas.addArista(24, 25, true, 49);
        viejo_caldas.addArista(24, 26, true, 35);        
        //Norcasia
        viejo_caldas.addArista(25, 27, true, 42);
        viejo_caldas.addArista(25, 26, true, 87);        
        //Victoria
        viejo_caldas.addArista(26, 27, true, 45);        
        //Dorada


        // Dpto Risaralda
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


        // DPTO RISARALDA CALDAS
        //Riosucio Guatica
        viejo_caldas.addArista(14, 43, true, 25);
        //Riosucio Quinchia
        viejo_caldas.addArista(14, 44, true, 19);
        //Riosucio Mistrato
        viejo_caldas.addArista(14, 41, true, 50);

        //Filadelfia Quinchia
        viejo_caldas.addArista(11, 44, true, 77);

        //Anserma Quinchia
        viejo_caldas.addArista(10, 44, true, 25);
        //Anserma Guatica
        viejo_caldas.addArista(10, 43, true, 12);
        //Anserma Belen
        viejo_caldas.addArista(10, 45, true, 28);

        //Neira Quinchia
        viejo_caldas.addArista(2, 44, true, 92);

        //Viterbo Apia
        viejo_caldas.addArista(7, 46, true, 17);
        //Viterbo Santuario
        viejo_caldas.addArista(7, 47, true, 54);
        //Viterbo Virginia
        viejo_caldas.addArista(7, 50, true, 23);

        // Belalcazar Virginia
        viejo_caldas.addArista(6, 50, true, 18);
        // Belalcazar Marsella
        viejo_caldas.addArista(6, 0, true, 74);

        // Chinchina Marsella
        viejo_caldas.addArista(5, 0, true, 28);
        // Chinchina SantaRosa
        viejo_caldas.addArista(5, 53, true, 14);

        //Villamaria SantaRosa
        viejo_caldas.addArista(3, 53, true, 43); 
        
        
        
         //Salento
        viejo_caldas.addArista(37, 36, false, 15);//Circasia
        viejo_caldas.addArista(37, 39, false, 20);//Filandia
        viejo_caldas.addArista(37, 33, false, 26);//Calarca
        viejo_caldas.addArista(37, 34, false, 26);//Armenia
        //Filandia
        viejo_caldas.addArista(39, 38, false, 16);//Quimbaya
        viejo_caldas.addArista(39, 36, false, 18);//Circasia
        //Circasia
        viejo_caldas.addArista(36, 38, false, 26);//Quimbaya
        viejo_caldas.addArista(36, 35, false, 16);//montenegro
        viejo_caldas.addArista(36, 34, false, 12);//Armenia
        //Armenia
        viejo_caldas.addArista(34, 35, false, 12);//Montenegro
        viejo_caldas.addArista(34, 32, false, 17);//La tebaida
        viejo_caldas.addArista(34, 33, false, 6);//Calarca
        //Calarca
        viejo_caldas.addArista(33, 32, false, 24);//La tebaida
        viejo_caldas.addArista(33, 30, false, 29);//Buena Vista
        viejo_caldas.addArista(33, 31, false, 27);//Cordoba
        //Quimbaya
        viejo_caldas.addArista(38, 35, false, 11);//Montenegro
        //Montenegro
        viejo_caldas.addArista(35, 32, false, 19);//La tebaida
        //Buena Vista
        viejo_caldas.addArista(30, 31, false, 17);//Cordoba
        viejo_caldas.addArista(30, 29, false, 12);//Pijao
        //Cordoba
        viejo_caldas.addArista(31, 29, false, 19);//Pijao
        //Pijao
        viejo_caldas.addArista(29, 28, false, 24);//Genova
        
        
        
        //Quindio-Risaralda
        viejo_caldas.addArista(39, 51, false, 33);//Filandia-Pereira
        viejo_caldas.addArista(37, 51, false, 38);//Salento-Pereira
        
        
        
        //Mistrato
        viejo_caldas.addArista(41, 42, false, 70);//Pueblo Rico
        viejo_caldas.addArista(41, 43, false, 25);//Guatica
        viejo_caldas.addArista(41, 45, false, 26);//Belen de umbria
        //Pueblo Rico
        viejo_caldas.addArista(42, 45, false, 54);//Belen de umbria
        viejo_caldas.addArista(42, 46, false, 26);//Apia
        viejo_caldas.addArista(42, 47, false, 40);//Santuario
        //Guatica
        viejo_caldas.addArista(43, 44, false, 18);//Quinchia
        viejo_caldas.addArista(43, 45, false, 25);//Belen de unbria
        //Belen de unbria
        viejo_caldas.addArista(45, 46, false, 28);//Apia
        //Apia
        viejo_caldas.addArista(46, 47, false, 15);//Santuario
        //Santuario
        viejo_caldas.addArista(47, 48, false, 23);//La celia
        viejo_caldas.addArista(47, 49, false, 38);//Balboa
        viejo_caldas.addArista(47, 50, false, 35);//La virginia
        //La celia
        viejo_caldas.addArista(48, 49, false, 14);//Balboa
        //Balboa
        viejo_caldas.addArista(49, 50, false, 19);//La virginia
        viejo_caldas.addArista(49, 51, false, 46);//Pereia
        //La virginia
        viejo_caldas.addArista(50, 51, false, 27);//Pereira
        viejo_caldas.addArista(50, 0, false, 55);//Marsella
        //Pereira
        viejo_caldas.addArista(51, 52, false, 5);//Dosquebradas
        viejo_caldas.addArista(51, 53, false, 15);//Santa rosa
        viejo_caldas.addArista(51, 0, false, 32);//Marsella
        //Dosquebradas
        viejo_caldas.addArista(52, 53, false, 12);//Santa rosa
        viejo_caldas.addArista(52, 0, false, 35);//Marsella
        //Santa rosa
        viejo_caldas.addArista(53, 0, false, 39);//Marsella
        
              
         //Salento
        viejo_caldas.addArista(37, 36, false, 15);//Circasia
        viejo_caldas.addArista(37, 39, false, 20);//Filandia
        viejo_caldas.addArista(37, 33, false, 26);//Calarca
        viejo_caldas.addArista(37, 34, false, 26);//Armenia
        //Filandia
        viejo_caldas.addArista(39, 38, false, 16);//Quimbaya
        viejo_caldas.addArista(39, 36, false, 18);//Circasia
        //Circasia
        viejo_caldas.addArista(36, 38, false, 26);//Quimbaya
        viejo_caldas.addArista(36, 35, false, 16);//montenegro
        viejo_caldas.addArista(36, 34, false, 12);//Armenia
        //Armenia
        viejo_caldas.addArista(34, 35, false, 12);//Montenegro
        viejo_caldas.addArista(34, 32, false, 17);//La tebaida
        viejo_caldas.addArista(34, 33, false, 6);//Calarca
        //Calarca
        viejo_caldas.addArista(33, 32, false, 24);//La tebaida
        viejo_caldas.addArista(33, 30, false, 29);//Buena Vista
        viejo_caldas.addArista(33, 31, false, 27);//Cordoba
        //Quimbaya
        viejo_caldas.addArista(38, 35, false, 11);//Montenegro
        //Montenegro
        viejo_caldas.addArista(35, 32, false, 19);//La tebaida
        //Buena Vista
        viejo_caldas.addArista(30, 31, false, 17);//Cordoba
        viejo_caldas.addArista(30, 29, false, 12);//Pijao
        //Cordoba
        viejo_caldas.addArista(31, 29, false, 19);//Pijao
        //Pijao
        viejo_caldas.addArista(29, 28, false, 24);//Genova
        
        
        
        //Quindio-Risaralda
        viejo_caldas.addArista(39, 51, false, 33);//Filandia-Pereira
        viejo_caldas.addArista(37, 51, false, 38);//Salento-Pereira
        
        
        
        //Mistrato
        viejo_caldas.addArista(41, 42, false, 70);//Pueblo Rico
        viejo_caldas.addArista(41, 43, false, 25);//Guatica
        viejo_caldas.addArista(41, 45, false, 26);//Belen de umbria
        //Pueblo Rico
        viejo_caldas.addArista(42, 45, false, 54);//Belen de umbria
        viejo_caldas.addArista(42, 46, false, 26);//Apia
        viejo_caldas.addArista(42, 47, false, 40);//Santuario
        //Guatica
        viejo_caldas.addArista(43, 44, false, 18);//Quinchia
        viejo_caldas.addArista(43, 45, false, 25);//Belen de unbria
        //Belen de unbria
        viejo_caldas.addArista(45, 46, false, 28);//Apia
        //Apia
        viejo_caldas.addArista(46, 47, false, 15);//Santuario
        //Santuario
        viejo_caldas.addArista(47, 48, false, 23);//La celia
        viejo_caldas.addArista(47, 49, false, 38);//Balboa
        viejo_caldas.addArista(47, 50, false, 35);//La virginia
        //La celia
        viejo_caldas.addArista(48, 49, false, 14);//Balboa
        //Balboa
        viejo_caldas.addArista(49, 50, false, 19);//La virginia
        viejo_caldas.addArista(49, 51, false, 46);//Pereia
        //La virginia
        viejo_caldas.addArista(50, 51, false, 27);//Pereira
        viejo_caldas.addArista(50, 0, false, 55);//Marsella
        //Pereira
        viejo_caldas.addArista(51, 52, false, 5);//Dosquebradas
        viejo_caldas.addArista(51, 53, false, 15);//Santa rosa
        viejo_caldas.addArista(51, 0, false, 32);//Marsella
        //Dosquebradas
        viejo_caldas.addArista(52, 53, false, 12);//Santa rosa
        viejo_caldas.addArista(52, 0, false, 35);//Marsella
        //Santa rosa
        viejo_caldas.addArista(53, 0, false, 39);//Marsella
        
        
        
        
        
        
        
        
        
        viejo_caldas.ver();
    }
    
}
