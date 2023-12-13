# MEITOR

## Iniciar Base De Datos de Archivos .txt
- Ejacutar el archivo InitDataBase 

## Login
- Email: admin@gmail.com 
- Password: admin123

## Empresa Brayan Cespedes

### Empleado

La clase Empleado, que extiende Persona e implementa las interfaces Serializable y EmpleadoInterface, está diseñada para manejar la información específica de los empleados en tu sistema. Incluye detalles como la zona de trabajo, el tiempo de trabajo y el sueldo.

Atributos Principales:

id: Identificador único para cada empleado, generado automáticamente.
zonaDeTrabajo: Representa el área o departamento donde trabaja el empleado.
tiempoDetrabajo: Indica la duración del empleo o el tiempo que ha trabajado el empleado en la empresa.
sueldo: Especifica el salario del empleado.
Constructores:

Un constructor sin argumentos.
Un constructor que acepta name, email, edad, zonaDeTrabajo, tiempoDetrabajo y sueldo, asignando automáticamente un ID único.
Métodos Importantes:

Métodos getters y setters para los atributos.
actualizar(): Actualiza la información del empleado en la base de datos, eliminando cualquier registro antiguo y añadiendo el actualizado.
Funcionalidad Adicional:

Permite una gestión efectiva de los datos de los empleados, facilitando su mantenimiento y actualización en la base de datos.
Esta clase es fundamental para el manejo de la información laboral y personal de los empleados dentro de tu sistema, ofreciendo una estructura organizada y coherente para almacenar y acceder a sus detalles.

### Empresa 

 La clase Empresa implementa la interfaz Serializable y EmpresaInterface, diseñada para manejar y almacenar la información de una empresa, incluyendo su nombre, proveedores, jefes y empleados.

Atributos Principales:

nombre: Un String que representa el nombre de la empresa.
proveedores: Una ArrayList que contiene objetos de la clase Proveedor.
jefes: Una ArrayList que almacena objetos de la clase Jefe.
empleados: Una ArrayList que contiene objetos de la clase Empleado.
Constructores:

Un constructor sin argumentos.
Un constructor que inicializa el nombre, proveedores, jefes y empleados de la empresa.
Métodos Importantes:

Métodos getters y setters para cada uno de los atributos.
despedirEmpleado(Empleado empleado): Elimina un empleado de la lista y actualiza la base de datos.
despedirJefes(Jefe jefe): Elimina un jefe de la lista y actualiza la base de datos.
Funcionalidad Adicional:

Proporciona una estructura organizativa para la empresa, permitiendo una gestión eficiente de su personal y colaboradores.
Esta clase es crucial para el manejo de la estructura organizativa de la empresa dentro de tu sistema, facilitando la administración de personal y la colaboración con proveedores.

### Jefe 

Extiende la clase Persona e implementa las interfaces Serializable y JefeInterface. La clase Jefe se utiliza para representar a los jefes en el sistema, manejando detalles específicos como su cargo, tiempo de trabajo y sueldo.

Atributos Principales:

id: Un identificador único para cada jefe, generado automáticamente.
cargo: Un String que indica el cargo o posición del jefe dentro de la empresa.
tiempoDeTrabajo: Un String que refleja el tiempo total que el jefe ha trabajado en la empresa.
sueldo: Un float que representa el salario del jefe.
Constructores:

Un constructor sin argumentos.
Un constructor que inicializa name, email, edad (heredados de Persona), así como cargo, tiempoDeTrabajo y sueldo, asignando un ID generado automáticamente.
Métodos Importantes:

Métodos getters y setters para los atributos.
actualizar(): Actualiza la información del jefe en la base de datos.
Funcionalidad Adicional:

Permite una gestión eficiente de la información de los jefes, facilitando la actualización y mantenimiento de sus datos en la base de datos.
Esta clase es fundamental para el manejo de la información de los jefes en tu sistema, proporcionando una estructura organizada para almacenar y acceder a sus detalles profesionales y personales.

### Persona

Implementa la interfaz Serializable y sirve como clase base para representar individuos en el sistema. Esta clase se encarga de gestionar información básica personal, como el nombre, correo electrónico y edad.

Atributos Principales:

name: Un String que representa el nombre de la persona.
email: Un String para el correo electrónico de la persona.
edad: Un int que indica la edad de la persona.
Constructores:

Un constructor sin argumentos.
Un constructor que inicializa name, email y edad.
Métodos Importantes:

Métodos getters para cada uno de los atributos (getName(), getEmail(), getEdad()).
actualizarPerfil(String name, String email, int edad): Permite actualizar la información del perfil de la persona.
Funcionalidad Adicional:

Proporciona una base común para representar a cualquier individuo en el sistema, facilitando la extensión a clases más específicas como Empleado o Jefe.
Esta clase es fundamental para manejar información personal básica de los individuos en tu sistema, ofreciendo una estructura clara y sencilla para su representación y manejo.
