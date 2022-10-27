package ru.lopata.madDiary.featureReminders.domain.useCase.event

data class EventUseCases(
    val getEventsUseCase: GetEventsUseCase,
    val getEventByIdUseCase: GetEventByIdUseCase,
    val getEventsBetweenDatesUseCase: GetEventsBetweenDatesUseCase,
    val getEventsForDate: GetEventsForDate,
    val createEventUseCase: CreateEventUseCase,
    val deleteEventUseCase: DeleteEventUseCase
)