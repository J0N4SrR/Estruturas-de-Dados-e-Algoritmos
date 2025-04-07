# QUESTÃO 1
Em dezembro de 1914, um dos maiores exploradores da Antártica, Ernest Shackleton, iniciava sua segunda expedição ao Polo Sul a bordo de seu navio, o *Endurance*. Porém, no início de 1915, depois de uma forte ventania, o *Endurance* foi arrastado ao mar congelante de Weddel. Após ficar mais de 10 meses parado entre dois blocos de gelo, o *Endurance* naufragou.

Shackleton tinha que decidir o que fazer o mais rápido possível, já que seus suprimentos estavam acabando e ele precisava alimentar diariamente 27 marinheiros e 68 cachorros.

A primeira ordem de Shackleton foi de construir uma cozinha e uma cabana com as madeiras que os marinheiros conseguiram resgatar do navio.  
A segunda ordem foi passada ao cozinheiro: racionar as refeições e o consumo de água. Mesmo estando no meio do gelo, a água doce era restrita e o processo de fusão (transformar gelo em água) consumia muito combustível.

A estratégia criada pelo cozinheiro para racionar o consumo da água foi a de lavar a louça somente com o resto da água não consumida na refeição.  
A ordem da lavagem da louça foi definida pelo cozinheiro como sendo **inversa à ordem de entrega na cozinha**.

Ou seja:
- A **última louça entregue** será a **primeira a ser lavada**,
- A **penúltima entregue** será a **segunda a ser lavada**,
- A **antepenúltima entregue** será a **terceira a ser lavada**,
- ... e assim por diante, até a **primeira louça entregue**.

Os marinheiros conseguiram resgatar, antes do naufrágio, **30 itens de cozinha** (entre pratos, talheres e canecas) que podem ser usados nas refeições.

Você deve criar um programa para apresentar **se todas as louças de uma refeição foram lavadas ou não**.

---

### 📥 Entrada
A entrada é constituída por **N linhas**. Cada linha pode apresentar os seguintes valores:

- `1`: um prato foi entregue ao cozinheiro
- `2`: um talher foi entregue ao cozinheiro
- `3`: um copo foi entregue ao cozinheiro
- `0`: o primeiro item na ordem da lavagem foi finalizado
- `-1`: a quantidade de água disponível acabou

---

### 📤 Saída
Seu programa deve apresentar na saída:
- `-1` caso o cozinheiro tenha lavado **toda a louça de uma determinada refeição**, ou `N` linhas indicando as louças **que não foram lavadas** naquela refeição.

# QUESTÃO 2
### 🚢 TRAVESSIAS

Você foi contratado para desenvolver um sistema capaz de gerenciar os **automóveis em uma balsa de transporte** que opera entre **Ilha Comprida** e **Cananeia**, em São Paulo. Esta balsa possui características específicas que tornam o processo de **embarque e desembarque mais ágil e eficiente**.

---

### ⚙️ Características da Balsa

1. A balsa tem **abertura em ambos os lados**, permitindo que os veículos **entrem por um lado e saiam pelo outro**, navegando apenas em **linha reta** para diminuir o tempo de translado.

2. A **capacidade máxima da balsa** é de **12 automóveis por viagem**, distribuídos em **duas fileiras paralelas** de 6 automóveis cada:

    - **Fileira A**: Primeira fileira a ser ocupada, comporta até **6 carros**.
    - **Fileira B**: Segunda fileira a ser ocupada, comporta até **6 carros**, mas **só é usada após a fileira A estar completa**.

3. Os automóveis são **identificados por um código único**.

---

### 💻 Tarefa
Implemente o código em **Java** capaz de resolver esse problema, respeitando as regras de embarque (Fileira A primeiro, depois Fileira B) e a capacidade máxima da balsa.




