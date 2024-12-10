const $d = document,
    $form = $d.querySelector('form')

let usuarios = []

function ajax(options) {
    let { url, method, fSuccess, fError, data } = options
    fetch(url, {
        method: method || 'GET',
        headers: { "Content-type": "application/json; charset=utf-8" },
        body: JSON.stringify(data)
    })
        .then(resp => resp.ok ? resp.json() : Promise.reject())
        .then(json => fSuccess(json))
        .catch(err => {
            let error = {
                status: err.status,
                statusText: err.statusText || "Ocurrió un error"
            }
            fError(error)
        })
}

function recuperarUsuarios() {
    ajax({
        url: 'http://localhost:8095/usuarios',
        fSuccess: users => {
            usuarios = users._embedded.usuarios
        },
        fError: error => console.log(error)
    })
}

function recuperarDatosUsuario() {
    const data = {
        // rol: `${$form.rol.value}`,
        dni: `${$form.dni.value}`,
        nombre: `${$form.nombre.value}`,
        telefono: `${$form.telf.value}`,
        direccion: `${$form.dir.value}`,
        email: `${$form.email.value}`,
        nusuario: `${$form.nUsu.value}`,
        cusuario: `${$form.passUsu.value}`
    }
    addUsuario(data)
}

function addUsuario(data) {
    ajax({
        url: 'http://localhost:8095/usuarios',
        method: 'POST',
        fSuccess: json => {
            console.log(json)
            usuarios.push(json)
        },
        fError: error => console.log(error),
        data
    })
}

$form.addEventListener("submit", recuperarDatosUsuario)