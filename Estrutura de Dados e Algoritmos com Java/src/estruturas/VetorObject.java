package estruturas;

public class VetorObject {
    private Object[] elementos;
    private int tamanho;

    public VetorObject(int capacidade){
        this.elementos = new Object[capacidade];
        this.tamanho = 0;

    }

    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            Object[] elementosNovo = new Object[this.elementos.length * 2];
           for(int i = 0; i < this.tamanho; i++){
               elementosNovo[i] = this.elementos[i];
           } this.elementos = elementosNovo;
        }
    }


    public boolean adiciona(Object e){
        aumentaCapacidade();
        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = e;
            this.tamanho++;
            return true;
        }
        return false;
    }
    // Metodo para adicionar elementos em qualquer posição
    public boolean adiciona(Object elemento, int posicao){
        aumentaCapacidade();
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }

        for(int i = this.tamanho -1 ; i >= posicao; i--){
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        tamanho++;
        return true;
    }

    public void remove(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }

        for(int i = posicao; i < this.tamanho - 1; i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;

    }

    // Metodo para saber o tamanho do vetor, da pra acessar com o metodo get também
    public int retornaTamanho(){
        return this.tamanho;
    }

    public Object busca(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int busca(Object elemento){
        //algoritimo de busca sequencial
        for(int i = 0; i < this.tamanho; i++){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }


    //Personalizando o Metodo toString para me imprimir os vetores
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i <= this.tamanho; i++) {
            s.append(this.elementos[i]);
            if (i < this.tamanho - 1) s.append(", ");
        }
        s.append("]");
        return s.toString();
    }

    //



}
