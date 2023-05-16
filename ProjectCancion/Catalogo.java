package S06.Trabajo_S06;

import javax.swing.*;
import java.util.LinkedList;

public class Catalogo {
    public static void main(String[] args) {
        LinkedList<Song> catalogo = new LinkedList<>();

        catalogo.add(new Song("Despacito", "Luis Fonsi"));
        catalogo.add(new Song("Monster", "Starset"));
        catalogo.add(new Song("Mix Chulla Vida", "Grupo 5"));
        catalogo.add(new Song("Hasta ese dia", "Lasso"));
        catalogo.add(new Song("Cafune", "Micro TDH"));

        byte op=0;
        while (op!=7){
         op=Byte.parseByte(JOptionPane.showInputDialog("Digite su opción:\n" +
                 "1.Mostrar lista de canciones\n" +
                 "2.Agregar un elemento al inicio de la lista\n" +
                 "3.Agregar un elemento al final de la lista\n" +
                 "4.Agregar un elemento al indice indicado\n" +
                 "5.Agregar una colección al final de la lista enlazada\n" +
                 "6.Agregar un colección al indice inicado\n" +
                 "7.Salir"));
         StringBuilder mensaje = new StringBuilder();
         switch (op){
             case 1:
                 mensaje.append("Catálogo de Canciones:\n");
                 mensaje.append("------------------------------------\n");
                 for (Song cancion: catalogo){
                     mensaje.append("Título: ").append(cancion.getTitulo()).append("\n");
                     mensaje.append("Artista: ").append(cancion.getArtista()).append("\n");
                     mensaje.append("------------------------------------\n");
                 }
                 JOptionPane.showMessageDialog(null,mensaje.toString());
                 break;
             case 2:
                 Song cancioninicio = new Song(JOptionPane.showInputDialog("Ingrese el titulo de la canción"),JOptionPane.showInputDialog("Ingrese el artista de la canción"));
                 catalogo.addFirst(cancioninicio);
                 break;
             case 3:
                 Song cancionfinal = new Song(JOptionPane.showInputDialog("Ingrese el titulo de la canción"),JOptionPane.showInputDialog("Ingrese el artista de la canción"));
                 catalogo.addLast(cancionfinal);
                 break;
             case 4:
                 int idx = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el índice al que quiere agregar la canción"));
                 Song cancionIndice = new Song(JOptionPane.showInputDialog("Ingrese el titulo de la canción"),JOptionPane.showInputDialog("Ingrese el artista de la canción"));
                 catalogo.add(idx,cancionIndice);
                 break;
             case 5:
                 int n1 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas canciones quiere agregar?"));
                 LinkedList<Song> nuevaLista = new LinkedList<>();
                 for (int i=0; i<n1; i++){
                     Song NuevaCancion = new Song(JOptionPane.showInputDialog("Ingrese el titulo de la canción"),JOptionPane.showInputDialog("Ingrese el artista de la canción"));
                     nuevaLista.add(NuevaCancion);
                 }
                 catalogo.addAll(nuevaLista);
                 break;
             case 6:
                 int n2 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas canciones quiere agregar?"));
                 int idx2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el índice al que quiere agregar el grupo de canciones"));
                 LinkedList<Song> nuevaLista2 = new LinkedList<>();
                 for (int i=0; i<n2; i++){
                     Song NuevaCancion2 = new Song(JOptionPane.showInputDialog("Ingrese el titulo de la canción"),JOptionPane.showInputDialog("Ingrese el artista de la canción"));
                     nuevaLista2.add(NuevaCancion2);
                 }
                catalogo.addAll(idx2,nuevaLista2);
                 break;
             case 7:
                 JOptionPane.showMessageDialog(null,"Gracias por utilizar el programa");
                 break;
             default:
                 JOptionPane.showMessageDialog(null,"Opción Incorrecta");
         }
        }
    }
}
