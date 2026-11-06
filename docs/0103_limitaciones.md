Como dispositivo real he escogido mi propio teléfono, cuyas **especificaciones** son:

| Característica | Especificación                                                                                   |
| -------------- | ------------------------------------------------------------------------------------------------ |
| CPU            | Octa-core Max. 2.80 GHz                                                                          |
| RAM            | 8.0 GB                                                                                           |
| Almacenamiento | _Total_: 128 GB      _Disponible_ 53.1 GB                                                        |
| Pantalla       | _Resolución_: 1080x2040 _Densidad_: xxhdpi                                                       |
| Android        | 15                                                                                               |
| API Level      | 35                                                                                               |
| Sensores       | _39 sensores_: Giroscopio, acelerómetro, proximidad, cuentapasos, temperatura, luz, magnético... |
| Estado Batería | _Batería Actual_: 56%     _Apps_: WhatsApp (45.47%), Suunto (12.28%) Niagara Launcher (6.19%)... |

### Conclusiones
En base a las especificaciones aportadas podemos sacar varias conclusiones en claro, 
destacando:
- **Eficiencia energética y gestión de sensores**: Dado el alto impacto energético
que implican las **aplicaciones de tracking energético**, como vemos con el dato
de *Suunto*, es importante que la app gestione los sensores y los servicios en 
segundo plano de forma inteligente.
- **Rendimiento y almacenamiento**: Dado que el dispositivo cuenta con un amplio
margen de **53.1 GB de almacenamiento disponible**, es viable implementar una
base de datos local para guardar todas las rutas y puntos GPS antes de sincronizarlos,
asegurando su funcionamiento sin cobertura.
- **Interfaz y pantalla**: Considerando la **alta densidad de pantalla (xxhdpi)**, se
deben emplear _gráficos vectoriales_ y _elementos escalables_ para garantizar que los
mapas de calor y los controles de la ruta se vean con nitidez y bien proporcionados al
cambiar de orientación.