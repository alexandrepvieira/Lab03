/**
 * 
 */
package lab03;

/**
 * @author Alexandre
 *
 */
public class Produto {
	
	String nome;
	float precoCusto;
	float precoVenda;
	
	/**
	 * Construtor
	 */
	public Produto(String nome) {
		  this.nome = nome;
	}
	public Produto(String nome,float precoCusto,float precoVenda) {
		this.nome = nome;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		
	}
	
	/**
	 * Metodos acessores e modificadores.
	 * @return
	 */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(float precoCusto) {
		this.precoCusto = precoCusto;
	}
	public float getPrecoVenda() {
		return precoVenda;
	}

	public boolean setPrecoVenda(float precoVenda) {
		if (precoVenda > precoCusto) {
			this.precoVenda = precoVenda;
		}
		return precoVenda > precoCusto;
	}
	
	/**
	 * Metodos
	 */
	
	public float calcularMargemLucro() {
		return precoVenda - precoCusto;
	} 

	public float getMargemLucroPorcentagem(float precoVenda) {
		return calcularMargemLucro() / precoVenda;
	}
}

