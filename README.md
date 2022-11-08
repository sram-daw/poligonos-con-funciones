# Diagrama de clase

```mermaid
classDiagram
   
    class poligonosFunciones{
    +valor1: float = 0
    +valor2: float = 0
       +triangulo(n1: float, n2:float) float
       +rectangulo(n1: float, n2:float) float
       +pentagono(n1: float, n2:float) float
       +hexagono(n1: float, n2:float) float
       +solicitarValores(figura: String) void
            
    }
  
```

# Diagrama de flujo
```mermaid
graph TB
    inicio((Inicio))-->Figura
    Figura[/Figura/] -->triangulo
    triangulo{Triangulo?}
    triangulo-->|Sí| CalcularTriangulo -->resultadoTriangulo
    triangulo-->|No| rectangulo
    resultadoTriangulo[\ResultadoTriangulo\]-->fin
    rectangulo{Rectangulo?}-->|Sí| CalcularRectangulo -->resultadoRectangulo
    resultadoRectangulo[\ResultadoRectangulo\]-->fin
    rectangulo-->|No| pentagono
    pentagono{Pentagono?}-->|Sí| CalcularPentagono-->resultadoPentagono
    resultadoPentagono[\ResultadoPentagono\]
    pentagono-->|No| hexagono
    hexagono{Hexagono?} -->|No| valida
    hexagono{Hexagono?} -->|Sí| CalcularHexagono-->fin
    valida[\IntroduzcaFiguraValida\]-->fin
    
    
   
    
    fin((Fin))