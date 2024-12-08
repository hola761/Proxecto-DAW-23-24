const $d = document,
  $contenedorClientesM = $d.getElementById('contenido-tabla-movil')

let usuarios = []

function ajax(options) {
  let { url, method, fSuccess, fError, data } = options;
  fetch(url, {
    method: method || "GET",
    headers: { "Content-type": "application/json; charset=utf-8" },
    body: JSON.stringify(data),
  })
    .then((resp) => (resp.ok ? resp.json() : Promise.reject(resp)))
    .then((json) => fSuccess(json))
    .catch((err) => {
      let error = {
        status: err.status,
        statusText: err.statusText || "Ocurrió un error",
      };
      fError(error);
    });
}

function recuperarClientes() {
  ajax({
    url: 'http://localhost:8095/usuarios',
    // fSuccess: json=>console.log(json),
    fSuccess: users => {
      usuarios = users._embedded.usuarios
      cargarUsuarios(usuarios)
    },
    fError: error => console.log(error)
  })
}

function cargarUsuarios(usuarios) {
  $contenedorClientesM.innerHTML = usuarios.map(usuario =>
    `
      <tr>
        <td>${usuario.dni}</td>
        <td>${usuario.nombre}</td>
        <td>${usuario.telefono}</td>
        <td><a href="#">Ver</a></td>
      </tr>
    `).join('')
}
$d.addEventListener('DOMContentLoaded', recuperarClientes)
