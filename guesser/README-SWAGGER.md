swagger-codegen generate \
  -i config/api-definitions.yml \
  -l spring \
  -o . \
  -c config/api-config.json

swagger-codegen config-help \
    -l spring
