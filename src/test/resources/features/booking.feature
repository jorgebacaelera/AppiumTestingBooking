Feature: Reservación en Booking

  @CasosExito
  Scenario Outline: Reservación exitosa en Booking

    Given que el Usuario busca el destino
    When ingresa el destino de la ciudad de <destino>
    And selecciona las fechas de estadía seleccionar desde el <fechaInicio> al <fechaFin>
    And selecciona <habitacion> habitación, <adultos> adultos y <niños> niños
    And selecciona la segunda opción del listado de resultados
    And selecciona el botón de reserva
    And ingresa los datos personales del usuario
    And ingresa datos del pago con tarjeta de credito
    Then confirma la reserva

    Examples:
      | destino | fechaInicio | fechaFin    | habitacion | adultos | niños |
      | Cusco   | Tue, Jun 06 | Wed, Jun 07 | 1          | 2       | 1     |

  @CasosError
  Scenario Outline: Búsqueda errónea para una reservación

    Given que el Usuario busca el destino
    When ingresa el destino de la ciudad de <destino>
    And selecciona las fechas de estadía seleccionar desde el <fechaInicio> al <fechaFin>
    And selecciona <habitacion> habitación, <adultos> adultos y <niños> niños
    And selecciona la segunda opción del listado de resultados
    And selecciona el botón de reserva
    And ingresa los datos personales del usuario
    And ingresa datos del pago con tarjeta de credito
    Then confirma la reserva

    Examples:
      | destino       | fechaInicio | fechaFin    | habitacion | adultos | niños |
      |               | Tue, Jun 06 | Wed, Jun 07 | 1          | 2       | 1     |
      | Tangamandapio | Tue, Jun 06 | Wed, Jun 07 | 1          | 2       | 1     |
      | Cusco         |             | Wed, Jun 07 | 1          | 2       | 1     |
      | Cusco         | Tue, Jun 06 |             | 1          | 2       | 1     |