import { createServer } from 'node:http';

const server = createServer(() => {
    console.log("ola mundo")
})

server.listen(3333)
