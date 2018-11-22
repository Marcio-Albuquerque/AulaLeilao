package padrão;

public class Lance {
    private Usuario usuario;
    private double valor;

    public Lance(Usuario usuário, double valor) {
            this.usuario = usuário;
            this.valor = valor;
    }

    public Usuario getUsuario() {
            return usuario;
    }

    public double getValor() {
            return valor;
    }
	
}
