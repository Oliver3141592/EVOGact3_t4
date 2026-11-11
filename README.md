# Actividad 3: CRUD de Citas (Spring Boot + JPA + MySQL)

CRUD de citas dentales con Spring Boot, Spring Data JPA, Thymeleaf y MySQL

**Autor:** Oliver Gildardo Enriquez Valencia
**Proyecto en el VPS:** http://179.236.236.29:8085
**Link del proyecto:** http://179.236.236.29:8085/

## Entidades y relación

- `Dentista` (lado **uno**): nombre, especialidad, cédula, teléfono.
- `Cita` (lado **muchos**): paciente, fecha y hora, motivo, estado y llave foránea `dentista_id`.

Relación **uno a muchos**: un dentista tiene muchas citas, y cada cita pertenece a un dentista (`@ManyToOne` en `Cita`, `@OneToMany(mappedBy = "dentista")` en `Dentista`).

<img width="886" height="333" alt="image" src="https://github.com/user-attachments/assets/b5587f8a-953a-4b3b-a85a-cfbe17f6b8b0" />
<img width="931" height="227" alt="image" src="https://github.com/user-attachments/assets/5cc59a43-4a84-4434-9f0d-e12c3b2ef3b9" />


## CRUD

### Leer (la relación se refleja: se ve el nombre del dentista, no solo su ID)

<img width="1831" height="551" alt="image" src="https://github.com/user-attachments/assets/047ac3c9-8851-42ff-9dbe-640dac0e8435" />


### Crear

<img width="906" height="728" alt="image" src="https://github.com/user-attachments/assets/656b7dd2-be1f-47b7-9ebb-a6331b26dbb0" />


### Actualizar

<img width="840" height="845" alt="image" src="https://github.com/user-attachments/assets/abbc4ebe-1964-48e3-8a7f-f76c38cf8c3c" />

### Eliminar

<img width="1890" height="442" alt="image" src="https://github.com/user-attachments/assets/a164b0e1-3909-4bda-a476-4c70417be374" />


## Configuración

`application.properties` usa variables de entorno (`DB_URL`, `DB_USER`, `DB_PASSWORD`, `PORT`) con valores genéricos por defecto, sin credenciales reales.
<img width="822" height="338" alt="image" src="https://github.com/user-attachments/assets/c51c0de9-9ca0-496a-af79-d299af3860e2" />

