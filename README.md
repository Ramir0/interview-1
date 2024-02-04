## Task 1
Implement an endpoint to get a post by Id

`GET - /posts/<POST_ID>`

## Task 2
Implement an endpoint to create a new post

`POST - /posts`

request body:
```
{
    "title": <POST_TITLE>,
    "content": <LONG_TEXT_CONTENT>
}
```

## Task 3
Fix the existing endpoint get posts by title

`GET - /posts/by-title?text=<TEXT_TO_FIND>`

## Task 4
Implement an endpoint to get posts created within given date range

`GET - /posts/by-date?from=YYYY-MM-DD&to=YYYY-MM-DD`

### Notes:
View DB: `http://localhost:8080/h2-console`