package state;

public class Livro {

    private String nome;
    private LivroEstado estado;

    public Livro(){this.estado = LivroEstadoNovo.getInstance();}

    public void setEstado(LivroEstado estado) {
        this.estado = estado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public LivroEstado getEstado() {
        return estado;
    }

    public boolean emprestar(){return estado.emprestar(this);}

    public boolean devolver(){return estado.devolver(this);}

    public boolean bloquear(){return estado.bloquear(this);}

    public boolean cadastrar(){return estado.cadastrar(this);}

    public boolean excluir(){return estado.excluir(this);}

    public boolean agendar(){return estado.agendar(this);}

    public boolean restaurar(){return estado.restaurar(this);}

    public boolean liberar(){return estado.liberar(this);}

}
