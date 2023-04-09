# rentalCarProjectUpdated
┣src -> main -> java/com/rentalCarProjectUpdated
 ┣ Week1 (Rental Car Projemizin ilk paketlerini oluşturduk ve Car Paketini gerekli öğelerle doldurup swagger ui aracılığıyla database'e crud işlemlerini dahil ettik. Projemiz çok katmanlı mimariye uygun olacak şekilde yazılmaya gayret edilmiştir.)
 ┃ ┣ car
 ┃ ┃ ┣ domain
 ┃ ┃ ┃ ┣Car.java
 ┃ ┃ ┣ repository
 ┃ ┃ ┃ ┣ICarRepository.java
 ┃ ┃ ┣ service
 ┃ ┃ ┃ ┣ dto
 ┃ ┃ ┃ ┃ ┣ CarDto.java
 ┃ ┃ ┃ ┣ impl
 ┃ ┃ ┃ ┃ ┣ CarService.java
 ┃ ┃ ┃ ┣ mapper
 ┃ ┃ ┃ ┃ ┣ ICarMapper.java
 ┃ ┃ ┃ ┣ ICarService.java
 ┃ ┃ ┃ ┣ web
 ┃ ┃ ┃ ┃ ┣ controller
 ┃ ┃ ┃ ┃ ┃ ┣ CarController.java
 ┃ ┃ ┃ ┃ ┣ request
 ┃ ┃ ┃ ┃ ┃ ┣ CarRequest.java
 ┃ ┃ ┃ ┃ ┣ response
 ┃ ┃ ┃ ┃ ┃ ┣ CarResponse.java
 ┃ ┣ config
 ┃ ┃ ┣ OpenApiConfig.java
 ┃
 ┃
 ┣ Week2 (Rental Car Projemizin Customer paketini oluşturduk ve gerekli öğelerle doldurup Car sınıfı ile mapper öğelerini bütünleştirdik)
 ┃ ┣ customer
 ┃ ┃ ┣ domain
 ┃ ┃ ┃ ┣Customer.java
 ┃ ┃ ┣ repository
 ┃ ┃ ┃ ┣ICustomerRepository.java
 ┃ ┃ ┣ service
 ┃ ┃ ┃ ┣ dto
 ┃ ┃ ┃ ┃ ┣ CustomerDto.java
 ┃ ┃ ┃ ┣ impl
 ┃ ┃ ┃ ┃ ┣ CustomerServiceImpl.java
 ┃ ┃ ┃ ┣ mapper
 ┃ ┃ ┃ ┃ ┣ CustomerMapper.java
 ┃ ┃ ┃ ┣ ICustomerService.java
 ┃
 ┃
 ┣ Week3 (Rental Car Projemizin Reservation paketini oluşturduk ve gerekli öğelerle doldurup swagger ui aracılığıyla database'e crud işlemlerini dahil edip Customer ve Car Sınıfları İle birleştirdik.)
 ┃ ┣ reservation
 ┃ ┃ ┣ domain
 ┃ ┃ ┃ ┣ Reservation.java
 ┃ ┃ ┣ mapper
 ┃ ┃ ┃ ┣IReservationMapper.java
 ┃ ┃ ┣ repository
 ┃ ┃ ┣ service
 ┃ ┃ ┃ ┣ dto
 ┃ ┃ ┃ ┃ ┣ ReservationDto.java
 ┃ ┃ ┃ ┃ ┣ ReservationInputDto.java
 ┃ ┃ ┃ ┣ impl
 ┃ ┃ ┃ ┃ ┣ ReservationServiceImpl.java
 ┃ ┃ ┃ ┣ IReservationService.java
 ┃ ┃ ┣ web
 ┃ ┃ ┃ ┣ controller
 ┃ ┃ ┃ ┃ ┣ ReservationController.java
 ┃ ┃ ┃ ┣ request
 ┃ ┃ ┃ ┣ response
 
 
 
 
 
 
 
 
 
 
 
 
 
 
