# TesteCaixaBranca
ETAPA 2 - Critérios de Caixa Branca - (Grafo de Fluxo; Complexidade Ciclomática; Base de Caminhos)

1. Ponto de entrada: Método `conectarBD()`
2. Ponto de entrada: Método `verificarUsuario(login, senha)`
3. Ponto de saída: Final do método `conectarBD()`
4. Ponto de saída: Final do método `verificarUsuario(login, senha)`

Grafo de Fluxo:
![GrafoDeFluxo](https://github.com/orenan43/TesteCaixaBranca/assets/113802691/6f194808-76f6-4ecd-973a-a0d297483c03)

Número de nós (n): 4
Número de arestas (e): 3
Número de regiões (r): 1
Complexidade Ciclomática (V(G)): e - n + 2r = 3 - 4 + 2*1 = 1

Portanto, a complexidade ciclomática do código é 1. Isso significa que há um único caminho de execução no código fornecido.

Como há apenas um caminho de execução, não há necessidade de identificar várias sequências diferentes.
