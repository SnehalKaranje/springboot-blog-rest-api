## When to version an API?
- Removed URI
- Updated path of existing URI
- Changing request/response format
- Added required input key-value
- Removed input key-value
- Removed output key-value
- Changed name of existing key
- Changed type of existing value
- A previously optional value is now required
- Added pagination support for an API with default page size. Therefore, now API returns subset of data in the response.

## Versioning strategies
- Versioning through URI path
  - Version is appended in URI path
  - Example:
    - http://host-name/api/v1/products
    - http://www.example.com/api/v1/products
- Versioning through custom headers
  - Version number is included in query parameter
  - http://www.example.com/api/products?version=1
- Versioning through custom headers
- Versioning through content negotiation
