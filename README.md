# proto-archetype

1. prepare a maven project
1. execute   
`mvn -DdefaultEncoding=utf-8 -Darchetype.filteredExtensions=java archetype:create-from-project`
1. install   
`cd target/generated-sources/archetype/`   
`mvn install`
1. use it   
`cd /tmp/archetype/`   
`mvn archetype:generate -DarchetypeCatalog=local`
