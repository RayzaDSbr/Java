
package excanalyt;

public class ExCanalYt {

    public static void main(String[] args) {
     Video v[] = new Video[3];
     
     v[0] = new Video("Aula de java");
     v[1] = new Video("Video sobre monte evereste");
     v[2] = new Video("VIdeo de rotina na india");
     
     //System.out.println(v[0].toString());
     
     Gafanhoto G[] = new Gafanhoto[2];
     
     G[0] = new Gafanhoto("Rayza", "F",21, "Ray12345" );
     G[1] = new Gafanhoto("Yuri", "M", 22,"yu_ri23");
     
     //System.out.println(G[0].toString());
     
     Visualizacao V1 = new Visualizacao(G[0],v[2]);
     V1.avaliar(60.7f);
     
     System.out.println(V1.toString());
     

    }
    
}
