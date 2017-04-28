swagger-codegen generate \
  -i config/api-definitions.yml \
  -l java \
  -o . \
  -c config/client-config.json

swagger-codegen config-help \
    -l spring
