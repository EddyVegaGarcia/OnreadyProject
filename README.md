# OnreadyProject

## [Descripción](https://docs.google.com/document/d/1w57m7jXaA1AGJT_lgVHY4YzbinTJ-mcfBbsyKll37Cw/edit)

-   Crear un programa cuyo punto de entrada sea un main en donde, al ejecutarse, se visualiza lo siguiente por consola y se termina la ejecución:
    
    > Marca: Peugeot // Modelo: 206 // Puertas: 4 // Precio: $200.000,00
    
    > Vehículo que contiene en el modelo la letra ‘Y’: Yamaha YBR $80.500,50
    
-   También visualización de los vehículos de mayor a menor precio de la forma:
    
    > Peugeot 208
    

## Solución del programa

-   JDK 8: Herramienta utilizada para el desarrollo de la solución del programa.
    
-   Diseño de solución orientada a objetos.
    
-   Diseño de contrato sin romper el concepto de **encapsulamiento**.
    
-   Diseño con una clase abstracta: _Vehicle_ y una interface: _Spec_ .
    
-   No hay ingreso por pantalla de ningún tipo.
    
-   La lista de vehículos, lo ví conveniente cargarlo en el constructor de `Dealership` ya que tiene sentido que una concesionaria tiene su inventario de sus vehículos, y no tiene que haber un ingreso por pantalla de ningún tipo.
    
-   El diseño de la impresión lo solucioné con la propiedad de POO que es **polimorfismo** con la interface _Sepc_ ya que los vehículos como tal no tienen el comportamiento de 'imprimir' sus especificaciones.
    

## Explicación del programa

-   Para la impresión de pantalla utilicé _String.format_ para definir cada atributo de manera adecuada y usar la herramienta de decimales `%,.2f` que me ayudó para que se visualice de esta manera:
    
    > $80.500,50
    
-   Para realizar el ejercicio de mayor y menor precio en la lista de vehículos, lo resolví pensando en ordenarlo con la ayuda de la herramienta de `Sort` en la clases que heredan de `Comparable` y así obtener con seguridad el de mayor precio y, en caso contrario, el de menor precio, comparando uno a uno mandando mensajes de comparación sin romper el **encapsulamiento**.
    
-   Se utilizó la herramienta de **herencia** de un nivel porque tanto los autos y motos heredan de vehículo, los hijos pueden llamar a sus atributos sin romper el **encapsulamiento**.
    

## Desarrollador

-   Tengo conocimientos de Git con lo cuál cree este respositorio y pude ir trabajando a la par con el desarrollo del programa.
    
-   Este trabajo puede desarrollarse desde un inicio con diseño **Unit Testing** con conceptos de **métodos ágiles** gracias a la herramienta de **Unix** para Java: `Junit`. 
