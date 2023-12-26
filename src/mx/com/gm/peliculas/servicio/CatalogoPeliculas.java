package mx.com.gm.peliculas.servicio;

public interface CatalogoPeliculas {

    String NOMBRE_RECURSO = "pelicuas.txt";

    void agregarPelicula(String nombrePelicula);

    void listarPeliculas();

    void buscarPelicula(String buscar);

    void iniciarCatalogoPeliculas();
}
