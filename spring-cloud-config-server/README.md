### How to test

- Step 06:
  Calling GET API: `localhost:8888/limits-service/default` will get the following response:
    ```
    {
        "name": "limits-service",
        "profiles": [
            "default"
        ],
        "label": null,
        "version": "08203283ca191ddb05ded9257ae4aec9a74f839b",
        "state": null,
        "propertySources": [
            {
                "name": "file:///C:/Users/lho/_Studying/git-localconfig-repo/file:C:\\Users\\lho\\_Studying\\git-localconfig-repo\\limits-service.properties",
                "source": {
                    "limits-service.minimum": "4",
                    "limits-service.maximum": "996"
                }
            }
        ]
    }
    ```