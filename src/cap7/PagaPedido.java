package cap7;

public class PagaPedido implements Comando {

	private Pedido pedido;

	public PagaPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	@Override
	public void executa() {
		System.out.println("pagando pedido do " + pedido.getCliente());
		this.pedido.paga();
	}

}
