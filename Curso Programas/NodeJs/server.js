import { createServer } from 'node:http'

const server = createServer((request, response) => {
    console.log('wello world')
})

server.listen(3333)

