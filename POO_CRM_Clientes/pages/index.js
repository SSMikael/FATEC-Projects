import Head from 'next/head';
import Link from 'next/link';

export default function Home() {
  return (
    <>
      <Head>
        <title>CRM FATEC - Pizzaria</title>
      </Head>
      
      <header style={{ backgroundColor: '#383e42', color: 'white', padding: '40px', textAlign: 'left' }}>
        <h1>CRM FATEC - Gestão de Clientes</h1>
      </header>

      <nav style={{ 
        backgroundColor: '#939597', 
        padding: '10px', 
        textAlign: 'center' }}
        >

        <Link href="/clientes" style={{ color: 'white', marginRight: '20px' }}>
            Clientes
            </Link>
        <Link href="/pedidos" style={{ color: 'white', marginRight: '20px' }}>
            Pedidos
            </Link>
        <Link href="/relatorios" style={{ color: 'white' }}>
            Relatórios
            </Link>
      </nav>
      
      <main style={{ padding: '20px' }}>
        <h2>Bem-vindo ao CRM da Pizzaria!</h2>
        <p>Gerencie seus clientes, pedidos e acompanhe relatórios em tempo real.</p>
      </main>
    </>
  );
}
