swagger-codegen generate \
  -i config/api-definitions.yml \
  -l spring \
  --library spring-cloud \
  -o . \
  -c config/client-config.json

swagger-codegen config-help \
    -l spring
