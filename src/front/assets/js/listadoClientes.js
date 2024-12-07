const $d = document,
  $contenedorClientesM = $d.querySelector("#contenido_tabla-movil");

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

function recuperarClientes(){
    ajax({
        url: 'http://localhost:8095/usuarios',
        fSuccess: json=>console.log(json),
        fError: error=>console.log(error)  
    })
}

$d.addEventListener('DOMContentLoaded', recuperarClientes)
