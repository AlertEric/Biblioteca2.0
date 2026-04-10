package org.biblioteca.model.enums;

public enum TipoLivro {
GENEROS_FICCAO_ROMANCE("Romance"),
GENEROS_FICCAO_FANTASIA("Fantasia"),
GENEROS_FICCAO_SCI_CIENTIFICA("Ficção Científica "),
GENEROS_FICCAO_SUSPENSEePOLICIAL("Suspense / Policial / Mistério"),
GENEROS_FICCAO_TERROR("Terror / Horror"),
GENEROS_FICCAO_AVENTURA("Aventura"),
GENEROS_FICCAO_DISTOPIA("Distopia"),
GENEROS_FICCAO_CONTO("Conto"),
GENEROS_FICCAO_NOVELA("Novela"),
GENEROS_NFICCAO_BIOGRAFIAeAUTOBIOGRAFIA("Biografia&Autobiografia"),
GENEROS_NFICCAO_AUTOAJUDA("Autoajuda"),
GENEROS_NFICCAO_REPORTAGEM("Narrativa Jornalística"),
GENEROS_NFICCAO_ENSAIOS("Ensaios");

    private String tipogenero;
    TipoLivro(String tipogenero) {
          tipogenero = this.tipogenero;

    }

}
