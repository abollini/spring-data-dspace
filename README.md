# Spring-data-dspace
Experimental repository to mock the spring data layer to use with Spring Data REST

This repository holds a first very rough implementation of a "new" spring date module intent to be used to wrap the current
DSpace access layer in a spring date fashion.
The ultimate goals is to have this wrapped layer well integrated with Spring Data REST know to get automatically
- Return codes and error handling
- Patterns for definition endpoints and supported methods
- Automatic ALPS & profile
- Support for projection
- Other ... (?)


# Current status
It doesn't work... right now when you @EnableDSpaceRepositories you get an exception during initialization

Parameter 0 of constructor in org.springframework.data.dspace.repository.support.DSpaceRepositoryFactoryBean required a bean of type 'java.lang.Class' that could not be found.


Action:

Consider defining a bean of type 'java.lang.Class' in your configuration.
