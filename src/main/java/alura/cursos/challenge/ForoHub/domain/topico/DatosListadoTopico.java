package alura.cursos.challenge.ForoHub.domain.topico;


public record DatosListadoTopico(
        Long id,
        String titulo,
        String mensaje,
        String fecha ) {

    public DatosListadoTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFecha());
    }
}